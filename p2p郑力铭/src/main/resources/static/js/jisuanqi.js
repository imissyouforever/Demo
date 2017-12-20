$(document).ready(function(e){
/*ͷ��*/
 $(".logo dl dd").click(function(){
    $(".logo dl dd .city").toggle();
    return false;	
 })
 $(document).click(function(){
   $(".logo dl dd .city").hide();
 })
/*����*/
 $(".leixing .info_l dl dd a").click(function(){
   $(this).addClass("hover").siblings().removeClass("hover");
   return false;
 })
/*�ӵ���*/
 $(window).scroll(function(){
   var sT = $(document).scrollTop();
   if(sT>=131){
     $(".sub_menu").show();
   }else{
     $(".sub_menu").hide();
   }
/*��Ϣ�տ�ʱ���*/
 $(".benxi table tr:even").css('background','#f7f7f7');
 })
/*���ض���*/
 $(".back ul .xinxi").hover(function(){
   $(this).addClass("hover");
   $(".back ul .xinxi p").addClass("hover");
   $(".back ul .xinxi span").show();
 },function(){
   $(this).removeClass("hover");
   $(".back ul .xinxi p").removeClass("hover");
   $(".back ul .xinxi span").hide();
 })
 
 $(window).scroll(function(){
   var wh = $(window).height();
   var st = $(document).scrollTop();
   
   if(st<=50){
     $(".back ul .back_btn").slideUp();
   }else{
     $(".back ul .back_btn").slideDown();
   }
   
 })
 
 $(".back ul .back_btn").hover(function(){
   $(this).addClass("hover");
 },function(){
   $(this).removeClass("hover");
 })
 
 $(".back ul .back_btn").click(function(){
   $("html,body").stop().animate({"scrollTop":0},0);
 })
 
  $(".weima_1").click(function(){
	 $(".sao").toggleClass("hover")
	 return false;
	 })
 $(document).click(function(){
	 $(".sao").removeClass("hover");
	 })
 $(".weima_2").click(function(){
	 $(".sao1").toggleClass("hover")
	 return false;
	 })
   $(document).click(function(){
	 $(".sao1").removeClass("hover");
	 })

})