<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Title</title>

</head>
<body>

<!--registration page-->

<!--<label for="name">name</label>-->
<!--<input id="name" type="text" name="name">-->
<!--<br>-->

<!--<br>-->
<!--<label for="email">email</label>-->
<!--<input id="email" type="email" name="email">-->
<!--<br>-->

<!--<label for="password">password</label>-->
<!--<input id="password" type="button" name="password">-->
<!--<br>-->

<!--<label for="age">age</label>-->
<!--<input id="age" type="button" name="age">-->
<!--<br>-->

<!--<button onclick="registerUser()">register user</button>-->




        registration page
<!--<form>-->
<label for="name">Name</label>
<input id="name" type="text" name="name">
<br>

<label for="age">age</label>
<input id="age" type="number" name="age">
<br>
<label for="password">password</label>
<input id="password" type="password" name="password">
<br>
<label for="email">email</label>
<input id="email" type="email" name="email">
<br>

<button onclick="registerUser()">register user</button>

<!--</form>-->

//<script
//        src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
//<script type="text/javascript">
//
//        function registerUser() {
//
//        let name = document.getElementById('name').value;
//        let age = document.getElementById('age').value;
//        let password = document.getElementById('password').value;
//        let email = document.getElementById('email').value;
//
//        console.log(name);
//
//        let request = {
//        'name': name,
//        'age': age,
//        'password': password,
//        'email': email
//        };
//
//        $.ajax({
//        type: "POST",
//        contentType: "application/json",
//        url: "/register",
//        data: JSON.stringify(request),
//        dataType: 'json',
//        cache: false,
//        timeout: 600000,
//        success: function (data) {
//        console.log("SUCCESS : ", data);
//        document.getElementById('name').value = '';
//        document.getElementById('password').value= '';
//        document.getElementById('email').value= '';
//        }
//        });
//        }
//
//</script>
</body>
</html>
