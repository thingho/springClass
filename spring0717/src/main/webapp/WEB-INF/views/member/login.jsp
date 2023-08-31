<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <title>Pages - Login</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="stylesheet" href="/css/login.css">
  <script>
    if("${resultCode}"=="f_login"){
	   alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인해주세요.");
	   $("#id").focus();
	}
  
    function loginBtn(){
    	if($("#id").val()=="" || $("#pw").val()==""){
    		alert("아이디 또는 패스워드를 입력하셔야 로그인이 가능합니다.");
    		$("#id").focus();
    		return false;
    	}
    	loginFrm.submit();
    }
  </script>
</head>

<body>
  <%@ include file="../layout/header.jsp" %>
  
  <section>
    <h1>로그인</h1>

    <article id="category">
      <ul>
        <li class="selected">회원 로그인</li>
        <li>비회원 주문조회</li>
      </ul>  
    </article>

    <form action="/member/login" name="loginFrm" method="post">
      <div class="id">
        <input type="text" name="id" id="id" size="30" placeholder="CJ ONE 통합아이디 6~20자">
      </div>
      <div class="pw">
        <input type="text" name="pw" id="pw" size="45" placeholder="비밀번호 영문, 특수문자, 숫자혼합 8~12자">
      </div>

      <div id="save">
        <div class="save"></div>
        <span>아이디 저장</span>
      </div>
  
      <div id="find">
        <span>아이디 찾기</span> <span class="separator">|</span> <span>비밀번호 찾기</span>
      </div>

      <button type="button" onclick="loginBtn()" style="cursor: pointer;">로그인</button>
    </form>

    <ul class="login-icons">
      <li class="phone"></li>
      <li class="kakao"></li>
      <li class="naver"></li>
      <li class="facebook"></li>
    </ul>

    <div class="sign-up-info">
      <h3>CJ ONE 통합회원이 아니신가요?</h3>
      <p>CJ ONE 통합회원으로 가입하시면 CJ제일제당의 다양한 서비스(COOKIT, CJ THE MARKET, CJ제일제당 홈페이지)를 이용하실 수 있습니다.</p>
      <div class="sign-up">CJ ONE 통합회원 신규가입하기 <div class="arrow">&emsp;</div></div>
    </div>
  </section>
  
  <%@ include file="../layout/footer.jsp" %>
 
</body>
</html>