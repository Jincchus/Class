/* 팝업 */
$(function(){

    $('.showPopup').click(function(e){
        e.preventDefault();
        $('#orderPopup').show();
    });

    $('#orderPopup .btnClose').click(function(){
        $('#orderPopup').hide();
    });

});

/* 사용자 팝업 */
$(function(){

    $('.showPopup').click(function(e){
        e.preventDefault();
        $('#userPopup').show();
    });

    $('#userPopup .btnClose').click(function(){
        $('#userPopup').hide();
    });

});