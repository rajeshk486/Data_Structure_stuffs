<table width="300" border="0" align="center" cellpadding="0" cellspacing="1">
<tr>
<td><form name="form1" method="post" action="loginsql.php">
<table width="100%" border="0" cellspacing="1" cellpadding="3">
<tr>
<td colspan="3"><strong>Login Page </strong></td>
</tr>
<tr>
<td width="71">E-mail</td>
<td width="6">:</td>
<td width="301"><input name="email" type="text" id="email"></td>
</tr>
<tr>
<td>Password</td>
<td>:</td>
<td><input name="password" type="text" id="password"></td>
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
<?PHP
if(isset($_GET['response']))
{
if($_GET['response'] == 0)
echo "fucked off,username/password not matches!";

else if($_GET['response'] == 1)
echo "USER login SUCESS :-)";

else
echo "database error";
}
?>
