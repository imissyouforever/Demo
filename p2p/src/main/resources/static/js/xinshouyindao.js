$(document).ready(function(e){
/*头部*/
 $(".logo dl dd").click(function(){
    $(".logo dl dd .city").toggle();
    return false;	
 })
 $(document).click(function(){
   $(".logo dl dd .city").hide();
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