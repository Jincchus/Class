$(function(){
	
	$('#btnUser2s').click(function(){
		$.ajax({
			url : '/Ch10/user2',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				console.log(data);
			}
		});
	});
	
	$('#btnUser2').click(function(){
		$.ajax({
			url : '/Ch10/user2/A101',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				console.log(data);
			}
		});
	});
	
	$('#btnUser2Register').click(function(){
		
		$.ajax({
			url : '/Ch10/user2',
			type : 'POST',
			dataType : 'json',
			success : function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser2Modify').click(function(){
		$.ajax({
			url : '/Ch10/user2',
			type : 'PUT',
			dataType : 'json',
			success : function(data){
				console.log(data);
			}
		});
	});
	$('#btnUser2Delete').click(function(){
		$.ajax({
			url : '/Ch10/user2/b101',
			type : 'DELETE',
			dataType : 'json',
			success : function(data){
				console.log(data);
			}
		});
	});
	
	$('#btnUser2Delete').click(function(){
		
	});
	
});