<?php
	require_once "class.php";
	$conn = new db_class();
	$username = $_POST['username'];
	$password = $_POST['password'];
	$firstname = $_POST['firstname'];
	$lastname = $_POST['lastname'];
	if(ISSET($_POST['signup'])){
		$check="SELECT username FROM user WHERE username = '$_POST[username]'";
		if ($check = true)
		{
			echo "User Already Exists <br/>";
}
		else{
			
			$conn->save($username, $password, $firstname, $lastname);
			echo '<script>alert("Successfully saved!")</script>';
			echo '<script>window.location= "login.html"</script>';
	}	
}
		
?>