$(function () {
    select();
});

function select() {
    var html = "";
    html = "<option value='1'>antennaAttributes</option>" +
        "<option value='2'>equipmentAttributes</option>" +
        "<option value='7'>basebandEquipmentCorrespondingCarrierUnit</option>" +
        "<option value='3'>moduleAndEquipmentContainer</option>" +
        "<option value='4'>moduleAttributes</option>" +
        "<option value='5'>portAttributes</option>" +
        "<option value='6'>portGroupContainer</option>";
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
            case "7":
                window.location.href="/cimConfig/basebandEquipmentCorrespondingCarrierUnit";
                break;
            case "2":
                window.location.href = "/cimConfig/equipmentAttributes";
                break;
            case "3":
                window.location.href = "/cimConfig/moduleAndEquipmentContainer";
                break;
            case "4":
                window.location.href = "/cimConfig/moduleAttributes";
                break;
            case "5":
                window.location.href = "/cimConfig/portAttributes";
                break;
            case "6":
                window.location.href = "/cimConfig/portGroupContainer";
                break;
        }
    });
}