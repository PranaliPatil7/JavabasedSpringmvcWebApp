<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title> 
</head>
<body >

       <h3>Fill Employee Details</h3>
  
    <form action="createNewEmployee" method="post">
        <table>
  
            <tr>
                <td>Full Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><input type="text" name="phone" /></td>
            </tr>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id" /></td>
            </tr>
            
  
        </table>
  
        <input type="submit" value="Create Employee">
  
    </form>
    
    <form action="getEmployeeById" method="get">
    <table>
    	<tr>
    		<td>Enter Employee Id:</td>
    		<td><input type = "text" name = "id" /></td>
    	</tr>
    </table>
    <input type="submit" value="Get Employee" >
    </form>
  
</body>
</html>