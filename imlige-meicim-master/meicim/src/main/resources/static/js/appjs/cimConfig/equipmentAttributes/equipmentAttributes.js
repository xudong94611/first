var prefix = "/cimConfig/equipmentAttributes"
$(function () {
    load();
});

layui.use('upload', function () {
    var upload = layui.upload;
    //执行实例
    var uploadInst = upload.render({
        elem: '#import', //绑定元素
        url: prefix + '/importExcel', //上传接口
        size: 1000,
        accept: 'file',
        done: function (r) {
            layer.msg(r.msg);
            reLoad();
        },
        error: function (r) {
            layer.msg(r.msg);
        }
    });
});

//导出Excel type导出的类型
//type 1 导出当页数据 2 导出全部数据 3 导出符合条件全部数据
function exportExcel(type) {
    //获取table的分页参数值
    var pageSize = $('#exampleTable').bootstrapTable('getOptions').pageSize;
    var pageNumber = $('#exampleTable').bootstrapTable('getOptions').pageNumber;
    var offset = pageSize * (pageNumber - 1);
    var limit = pageSize;
    var data = 'limit=' + limit + '&offset=' + offset;
    //后端导出的方法
    document.location.href = prefix + "/exportExcel?type=" + type + "&" + data;
}

function load() {
    $('#exampleTable')
        .bootstrapTable(
            {
                method: 'get', // 服务器数据的请求方式 get or post
                url: prefix + "/list", // 服务器数据的加载地址
                //	showRefresh : true,
                //	showToggle : true,
                //	showColumns : true,
                iconSize: 'outline',
                toolbar: '#exampleToolbar',
                striped: true, // 设置为true会有隔行变色效果
                dataType: "json", // 服务器返回的数据类型
                pagination: true, // 设置为true会在底部显示分页条
                // queryParamsType : "limit",
                // //设置为limit则会发送符合RESTFull格式的参数
                singleSelect: false, // 设置为true将禁止多选
                // contentType : "application/x-www-form-urlencoded",
                // //发送到服务器的数据编码类型
                pageSize: 10, // 如果设置了分页，每页数据条数
                pageNumber: 1, // 如果设置了分布，首页页码
                //search : true, // 是否显示搜索框
                showColumns: false, // 是否显示内容下拉框（选择显示的列）
                sidePagination: "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                queryParams: function (params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset: params.offset,
                        searchName:$('#searchName').val()
                        // username:$('#searchName').val()
                    };
                },
                // //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
                // queryParamsType = 'limit' ,返回参数必须包含
                // limit, offset, search, sort, order 否则, 需要包含:
                // pageSize, pageNumber, searchText, sortName,
                // sortOrder.
                // 返回false将会终止请求
                columns: [
                    {
                        checkbox: true
                    },
                    {
                        field: 'serial',
                        title: 'ID'
                    },
                    {
                        field: 'className',
                        title: 'className'
                    },
                    {
                        field: 'modelNumber',
                        title: 'modelNumber'
                    },
                    {
                        field: 'abbreviation',
                        title: 'abbreviation'
                    },
                    {
                        field: 'description',
                        title: 'description'
                    },
                    {
                        field: 'manufacture',
                        title: 'manufacture'
                    },
                    {
                        field: 'capacityArray',
                        title: 'capacityArray'
                    },
                    {
                        field: 'major',
                        title: 'major'
                    },
                    {
                        field: 'serviceLife',
                        title: 'serviceLife'
                    },
                    {
                        field: 'width',
                        title: 'width'
                    },
                    {
                        field: 'depth',
                        title: 'depth'
                    },
                    {
                        field: 'height',
                        title: 'height'
                    },
                    {
                        field: 'faceDepth',
                        title: 'faceDepth'
                    },
                    {
                        field: 'weight',
                        title: 'weight'
                    },
                    {
                        field: 'ratedPower',
                        title: 'ratedPower'
                    },
                    {
                        field: 'installationMode',
                        title: 'installationMode'
                    },
                    {
                        field: 'installationEnviroment',
                        title: 'installationEnviroment'
                    },
                    {
                        field: 'spaceRequirement',
                        title: 'spaceRequirement'
                    },
                    {
                        field: 'label',
                        title: 'label'
                    },
                    {
                        field: 'unitName',
                        title: 'unitName'
                    },
                    {
                        field: 'quotaSerial',
                        title: 'quotaSerial'
                    },
                    {
                        field: 'netTypes',
                        title: 'netTypes'
                    },
                    {
                        cellStyle: function (value, row, index, field) {
                            return {
                                css: {"white-space": "nowrap"}
                            }
                        },
                        title: '操作',
                        field: 'id',
                        align: 'center',
                        formatter: function (value, row, index) {
                            var e = '<a class="btn btn-primary btn-sm ' + s_edit_h + '" href="#" mce_href="#" title="编辑" onclick="edit(\''
                                + row.serial
                                + '\')"><i class="fa fa-edit"></i></a> ';
                            var d = '<a class="btn btn-warning btn-sm ' + s_remove_h + '" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                + row.serial
                                + '\')"><i class="fa fa-remove"></i></a> ';
                            var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                + row.serial
                                + '\')"><i class="fa fa-key"></i></a> ';
                            return e + d;
                        }
                    }]
            });
}

function reLoad() {
    $('#exampleTable').bootstrapTable('refresh');
}

function add() {
    layer.open({
        type: 2,
        title: '增加',
        maxmin: true,
        shadeClose: false, // 点击遮罩关闭层
        area: ['800px', '520px'],
        content: prefix + '/add' // iframe的url
    });
}

function edit(id) {
    layer.open({
        type: 2,
        title: '编辑',
        maxmin: true,
        shadeClose: false, // 点击遮罩关闭层
        area: ['800px', '520px'],
        content: prefix + '/edit/' + id // iframe的url
    });
}

function remove(id) {
    layer.confirm('确定要删除选中的记录？', {
        btn: ['确定', '取消']
    }, function () {
        $.ajax({
            url: prefix + "/remove",
            type: "post",
            data: {
                'serial': id
            },
            success: function (r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
                    layer.msg(r.msg);
                }
            }
        });
    })
}

function resetPwd(id) {
}

function batchRemove() {
    var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
    if (rows.length == 0) {
        layer.msg("请选择要删除的数据");
        return;
    }
    layer.confirm("确认要删除选中的" + rows.length + "条数据吗?", {
        btn: ['确定', '取消']
        // 按钮
    }, function () {
        var ids = new Array();
        // 遍历所有选择的行数据，取每条数据对应的ID
        $.each(rows, function (i, row) {
            ids[i] = row['serial'];
        });
        $.ajax({
            type: 'POST',
            data: {
                "ids": ids
            },
            url: prefix + '/batchRemove',
            success: function (r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
                    layer.msg(r.msg);
                }
            }
        });
    }, function () {

    });
}