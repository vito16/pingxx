$(function() {
    $("#sub-nav-product").attr("class","active");
    $(".addCart").click(function () {
        $.ajax({
            url:ctx+"/cart/add/"+$(this).attr("productid")+"/1",
            success:function(result){
                if(result=="success"){
                    alert("添加购物车成功...");
                }else{
                    alert("发生错误..");
                }
            },
            error:function(){
                alert("发生错误..");
            }
        })
    })
})