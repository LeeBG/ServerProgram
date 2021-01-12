function deleteById(userId){
	$.ajax({
		type:"post",
		url:"/serverproject/user?cmd=delete&id="+userId,
		dataType: "json"
	}).done(function(result){
		console.log(result);
		if(result.statusCode == 1){
			location.href = "index.jsp";
		}else{
			alert("삭제에 실패하였습니다.");
		}
	});
}