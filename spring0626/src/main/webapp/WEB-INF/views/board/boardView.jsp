<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="stylesheet" href="/css/read.css">
  <style>
  	.list{cursor: pointer;}
  </style>
  <script>
	  function deleteBtn(){
		  if(confirm("게시글을 삭제하시겠습니까?")){
			  alert("${bdto.bno}");
			  location.href="boardDelete?bno=${bdto.bno}";
		  }
	  }
	</script>	
</head>
<body>
<section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="3">제목${bdto.bno}</th>
      </tr>
      <tr>
        <td colspan="3"><strong>${bdto.btitle}</strong></td>
      </tr>
      <tr>
        <td>${bdto.id}</td>
        <td>조회수</td>
        <td>${bdto.bhit}</td>
      </tr>
      <tr>
        <td colspan="3" class="article">${bdto.bcontent}</td>
      </tr>
      <tr>
        <td colspan="3" class="article"><strong>${bdto.bfile}</strong> <span class="separator">|</span></td>
      </tr>
      <tr>
      	<td colspan="3">
	      <c:if test="${bdto.bfile!=null}">
      		<img src="/images/${bdto.bfile}">
      	  </c:if>
      	  <c:if test="${bdto.bfile==null}">
      		<strong>등록된 파일이 없습니다.</strong>
      	  </c:if>
      	</td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> 
          <a href="/board/boardView?bno=${nextDto.bno}&page=${page}&category=${category}&s_word=${s_word}">${nextDto.btitle}</a>
        </td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> 
          <a href="/board/boardView?bno=${prevDto.bno}&page=${page}&category=${category}&s_word=${s_word}">${prevDto.btitle}</a>
        </td>
      </tr>
      
    </table>
	
    <a href="boardList?&page=${page}&category=${category}&s_word=${s_word}"><div class="list">목록</div></a>
    <a onclick="deleteBtn()"><div class="list">삭제</div></a>
    <a href="boardUpdate?bno=${bdto.bno}&page=${page}&category=${category}&s_word=${s_word}"><div class="list">수정</div></a>
    <a href="boardReply?bno=${bdto.bno}&page=${page}&category=${category}&s_word=${s_word}"><div class="list">답변달기</div></a>
  </section>
</body>
</html>