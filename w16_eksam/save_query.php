<?php
	require_once "class.php";
	$conn = new db_class();
	$username = $_POST['username'];
	$password = $_POST['password'];
	$firstname = $_POST['firstname'];
	$lastname = $_POST['lastname'];
	if(ISSET($_POST['signup'])){
		$sql="select * from user where (username='$username');";

		//$res=mysqli_query($mysqli,$sql);

		//if (mysqli_num_rows($res) > 0) {
			
			//$row = mysqli_fetch_assoc($res);
			if($username==isset(['username']))
			{
					echo "Username already exists";
			}
			//}
		else{
			
			$conn->save($username, $password, $firstname, $lastname);
			echo '<script>alert("Successfully saved!")</script>';
			echo '<script>window.location= "login.html"</script>';
	}	
}
		
?>