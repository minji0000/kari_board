<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> 와아 한글 된다  </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

    <div class="container">	
        <h2>로그인폼</h2>
        <form action="login.jsp" method="post">
            <div class="mb-3">
                <label class="form-label" for="id">아이디</label> 
                <input class="form-control" type="text" name="id" id="id" />
            </div>
            <div class="mb-3">
                <label class="form-label" for="pwd">비밀번호</label> 
                <input class="form-control" type="password" name="pwd" id="pwd" />
            </div>
            <button class="btn btn-outline-primary btn-sm" type="submit">로그인</button>
        </form>
        <button class="btn btn-outline-primary btn-sm"><a href="/user/register">회원가입</a></button>
    </div>

</body>
</html>