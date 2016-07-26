<html>

<table width="300" border="0" align="center" cellpadding="0" cellspacing="1">
<tr>
<td><form name="form1" method="post" action="signupsql.php">
<table width="100%" border="0" cellspacing="1" cellpadding="3">
<tr>
<td colspan="3"><strong>Login Page </strong></td>
</tr>
<tr>
<td width="71">FullName</td>
<td width="6">:</td>
<td width="301"><input name="name" type="text" id="name"></td>
</tr>

<tr>
<td width="71">E-mail</td>
<td width="6">:</td>
<td width="301"><input name="email" type="text" id="email"></td>
</tr>
<tr>
<td width="71">Phone</td>
<td width="6">:</td>
<td width="301"><input name="phone" type="text" id="phone"></td>
</tr>
<tr>
<td>Password</td>
<td>:</td>
<td><input name="password" type="password" id="password"></td>
</tr>
<tr>
<tr>
<td colspan="3" align="center"><input type="submit" name="Submit" value="Submit"></td>
</tr>
</table>
</form>
</td>
</tr>
</table>
<input type="hidden" name="case" id="hiddenField" value="<?php echo $_POST['1'] ?>" />

<?PHP
if(isset($_GET['response']))
{
if($_GET['response'] == 0)
echo "USER REGISTERED SUCESSFULLY :-)";
else if($_GET['response'] == 1)
echo "fucked off,Email already exists!";
else
echo "database error";
}
?>
</html>