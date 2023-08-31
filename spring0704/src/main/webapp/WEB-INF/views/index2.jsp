<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- 제이쿼리 최신 -->
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<title>어쩔티비2 XML로</title>
		<style>
			h3{text-align: center;}
			table{width:1000px; margin:0 auto; text-align: center;}
			table,th,td{border: 1px solid black; border-collapse: collapse;}
			th,td{width:200px; height:60px;}
			img{width:60px;}
			div{width:350px; height:60px; margin:10px auto;}
			input{width:200px; height:30px;}
			button{width:120px; height:40px;}
		</style>
		<script>
			function ajax_xml(){
				alert("공공데이터를 가져옵니다.");
				
				$.ajax({
					url:"/ajax_xml",
					type : "get",
					dataType : "xml",
					data: {"page":"1"},
					success:function(data){
						alert("성공");
						console.log(data);
						
						let htmlData="";
						_xml = $(data).find("items"); //items태그 검색
						let len = _xml.find("item").length; //길이:10
						
						for(let i=0; i<len; i++){
							htmlData += "<tr>";
							htmlData += "<td>"+_xml.find("item").eq(i).find("galContentId").text()+"</td>";
							htmlData += "<td>"+_xml.find("item").eq(i).find("galTitle").text()+"</td>";
							htmlData += "<td>"+_xml.find("item").eq(i).find("galPhotographyMonth").text()+"</td>";
							htmlData += "<td>"+_xml.find("item").eq(i).find("galPhotographyLocation").text()+"</td>";
							htmlData += "<td><img src='"+_xml.find("item").eq(i).find("galWebImageUrl").text()+"'></td>";
							htmlData += "</tr>";
						}
						
						$("#tbody").html(htmlData);
						
						
					},
					error:function(){
						alert("실패");
					}
					
				}) //ajax
				
			} //function ajax_xml
			
		</script>
	</head>
	<body>
	  <h3>메인페이지2 XML</h3>
	  <p></p>
	  <button type="button" onclick="ajax_xml()">공공데이터 가져오기</button>
	  <br>
	  <h3>관광 정보2</h3>
	  <div>
	  	<input type="text" name="s_word" id="s_word">
	  	<button type="button" onclick="search()">검색</button>
	  </div>
	  <table>
	    <tr>
	    	<th>번호</th>
	    	<th>제목</th>
	    	<th>촬영날짜</th>
	    	<th>촬영장소</th>
	    	<th>이미지</th>
	    </tr>
	    <tbody id="tbody">
	      <tr>
	      	<td colspan="5">데이터를 검색합니다.2</td>
	      </tr>
	    </tbody>
	  </table>
	</body>
</html>