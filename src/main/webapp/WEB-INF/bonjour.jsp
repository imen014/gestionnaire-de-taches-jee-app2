<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello world !</h1>

<form action="TestxServlet" method="POST">

<label for="id_tache">  id  </label>
<input type="text" name="id_tache" id="id_tache" />

<label for="saisi_task">  Tâche </label>
<input type="text" name="saisi_task" id="saisi_task" />

<label for="state_task"> État </label>
<input type="text" name="state_task" id="state_task" />

<input type="submit" value="Valider" />
</form>

</body>
</html>