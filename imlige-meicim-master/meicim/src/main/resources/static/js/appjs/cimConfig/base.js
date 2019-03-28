$(function () {
    select();
});

function select() {
    var html = "";
    html = "<option value='1'>antennaAttributes</option>" +
        "<option value='2'>basebandEquipmentCorrespondingCarrierUnit</option>" +
        "<option value='3'>equipmentAttributes</option>" +
        "<option value='4'>moduleAndEquipmentContainer</option>" +
        "<option value='5'>moduleAttributes</option>" +
        "<option value='6'>portAttributes</option>" +
        "<option value='7'>portGroupContainer</option>" +
        "<option value='8'>cableDefinitions</option>" +
        "<option value='9'>cableTrayAttributes</option>" +
        "<option value='10'>captionArrayDefinition</option>" +
        "<option value='11'>Const</option>" +
        "<option value='12'>conventionalSignContainerAttributes</option>";
    $("#table").append(html);
    $('#table').on('change', function () {
        var value = $("#table option:selected").val();
        switch (value) {
            default:
                window.location.href = "/cimConfig/antennaAttributes";
                break;
            case "1":
                window.location.href = "/cimConfig/antennaAttributes";
                break;
            case "2":
                window.location.href="/cimConfig/basebandEquipmentCorrespondingCarrierUnit";
                break;
            case "3":
                window.location.href = "/cimConfig/equipmentAttributes";
                break;
            case "4":
                window.location.href = "/cimConfig/moduleAndEquipmentContainer";
                break;
            case "5":
                window.location.href = "/cimConfig/moduleAttributes";
                break;
            case "6":
                window.location.href = "/cimConfig/portAttributes";
                break;
            case "7":
                window.location.href = "/cimConfig/portGroupContainer";
                break;
            case "8":
                window.location.href = "/cimConfig/cableDefinitions";
                break;
            case "9":
                window.location.href = "/cimConfig/cableTrayAttributes";
                break;
            case "10":
                window.location.href = "/cimConfig/captionArrayDefinition";
                break;
            case "11":
                window.location.href = "/cimConfig/const";
                break;
            case "12":
                window.location.href = "/cimConfig/conventionalSignContainerAttributes";
                break;
        }
    });
}