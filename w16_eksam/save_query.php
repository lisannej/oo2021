<?php
	require_once "class.php";
	$conn = new db_class();
	$username = $_POST['username'];
	$password = $_POST['password'];
	$firstname = $_POST['firstname'];
	$lastname = $_POST['lastname'];
	if(ISSET($_POST['signup'])){
	$check="SELECT username FROM user WHERE username = '$_POST[username]'";
		if ($check!=false){
			echo '<script>alert("User already exists!")</script>';
			echo '<script>window.location= "index.html"</script>';
		}
		else{	
			$conn->save($username, $password, $firstname, $lastname);
			echo '<script>alert("Successfully saved!")</script>';
			echo '<script>window.location= "login.html"</script>';
	}	
}
		
?>