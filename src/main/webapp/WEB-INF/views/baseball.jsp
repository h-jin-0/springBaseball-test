<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<br />
		<div class="btn-group">
			<button type="button" class="btn btn-primary dropdown-toggle"
				data-toggle="dropdown">팀</button>
			<div class="dropdown-menu">
				<c:forEach var="team" items="${teams}">
					<a class="dropdown-item" onclick="teamAll(${team.id})">${team.name}</a>
				</c:forEach>
			</div>

		</div>
		<div class="btn-group">
			<button type="button" class="btn btn-primary dropdown-toggle"
				data-toggle="dropdown">선수</button>
			<div class="dropdown-menu" id="player"></div>
		</div>
		<br /><br /><br />
		<table border="1">
			<tr id="title">
				<th>id</th>
				<th>name</th>
				<th>teamName</th>
			</tr>

				<tr class="item">

				</tr>

		</table>
	</div>

	<script>
function teamAll(team_id){
	
		$.ajax({
			type : 'GET',
			url : '/api/playerAll/'+team_id,
			dataType : 'json'
		}).done(function(result) {
			console.log(result)
			$('.player_item').remove();
			result.forEach(function(player) {
				$('#player').append("<a class='dropdown-item player_item'onclick='teamDetail("+player.id+")'>"+player.name+"</a>");
			});
			
		}).fail(function(result) {
			alert('서버오류');
		});
	}
function teamDetail(player_id){
	
	$.ajax({
		type : 'GET',
		url : '/api/playerDetail/'+player_id,
		dataType : 'json'
	}).done(function(result) {
		console.log(result);
		$('.detail_item').remove();
			let detail="<tr class='detail_item'><td>"
				+result.playerId
				+"</td><td>"
				+result.playerName
				+"</td><td>"
				+result.teamName+"</td></tr>"
			$('#title').after(detail);
			detail='';
			

	}).fail(function(result) {
		alert('서버오류');
	});
}


</script>
</body>
</html>
