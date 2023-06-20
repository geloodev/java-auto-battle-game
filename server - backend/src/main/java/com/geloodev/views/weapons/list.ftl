<!DOCTYPE html>
<html>
    <head>
        <title>Weapons</title>
    </head>

    <body>
        <h1>Weapons</h1>
        <ul>
            <#list weapons as weapon>
                <li>UUID: ${weapon.id}</li>
                <li>Name: ${weapon.name}</li>
                <li>Dammage: ${weapon.dammage}</li>
                <li>Category: ${weapon.category}</li>
                <br>
            </#list>
        </ul>
    </body>
</html>