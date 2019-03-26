$().ready(function () {
    validateRule();
});

$.validator.setDefaults({
    submitHandler: function () {
        save();
    }
});
function save() {
    $.ajax({
        cache: true,
        type: "POST",
        url: "/manageFile/baseStation/save",
        data: $('#signupForm').serialize(),// 你的formid
        async: false,
        error: function (request) {
            parent.layer.alert("Connection error");
        },
        success: function (data) {
            if (data.code == 0) {
                parent.layer.msg("操作成功");
                parent.reLoad();
                var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
                parent.layer.close(index);

            } else {
                parent.layer.alert(data.msg)
            }

        }
    });

}
function validateRule() {
    var icon = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        rules: {
            province: {
                required: true
            },
            city: {
                required: true
            },
            district: {
                required: true
            },
            name: {
                required: true
            },
            filePath: {
                required: true
            },
            address: {
                required: true
            },
            baseFeature: {
                required: true
            }
        },
        messages: {
            province: {
                required: icon + "请输入province"
            },
            city: {
                required: icon + "请输入city"
            },
            district: {
                required: icon + "请输入district"
            },
            name: {
                required: icon + "请输入name"
            },
            filePath: {
                required: icon + "请输入filePath"
            },
            address: {
                required: icon + "请输入address"
            },
            baseFeature: {
                required: icon + "请输入baseFeature"
            }
        }
    })
}