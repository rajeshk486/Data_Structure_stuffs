<html>

<?PHP

$user_name = "root";
$password = "";
$database = "test1";
$server = "127.0.0.1";
$db_handle = mysql_connect($server, $user_name, $password);
$db_found = mysql_select_db($database, $db_handle);
mysql_connect($server, $user_name, $password);

if ($db_found) {
echo "Database Found " . $db_handle;
$name=$_POST['name'];
$email=$_POST['email'];
$password=$_POST['password'];
$case = 1;//POST['case'];
$SQL= "select * from userlist where email = '$email' ";	
$count = mysql_query($SQL);
$response = 0;
echo $count. "<BR>";

if(( $response = mysql_num_rows($count)) == 0) 
{
	if($case == 1)
		{
		$phone=$_POST['phone'];
		echo "gonna insert";
		$SQL= "insert into test1.userlist ( name, email, password, phone,appid ) values( '$name', '$email','$password', '$phone', 420) ";
		$result = mysql_query($SQL)or die ('Error: ' .mysql_error());
		if($result)
		{
			echo "tyahoooooooooooooooo";
			echo $name . "<BR>";
			echo $email . "<BR>";
			echo $phone . "<BR>";
		}
		else
			echo "user already exist :-)";

		}
	else if($case == 2)
	{
		$SQL= "select * from userlist where email = '$email' and password = '$password'; ";	
		$count = mysql_query($SQL);
		if($count == 1)
			$response = 1;
		else
			$response = 0;
	}

	mysql_close($db_handle);
}
else 
{
	$respopnse = 2;
}

/*condition for return*/
if($response == 0)
	{
	if($case ==1)
		header('Location: signup.php?response=0');
	else if($case ==2)
		header('Location: login.php?response=0');	
	}
else if($response == 1)
	{
	if($case == 1)
		header('Location: signup.php?response=1');
	else if($case == 2)
		header('Location: login.php?response=1');	
	}
else
	{
	if($case == 1)
		header('Location: signup.php?response=2');
	else if($case == 2)
		header('Location: login.php?response=2');		
	}
}
 
	?>
</html>