<!DOCTYPE html>
<html>
    <head>
        <title>Characters</title>
    </head>

    <body>
        <h1>Characters</h1>
        <ul>
            <#list characters as character>
                <li>uuid: ${character.id}</li>
                <li>name: ${character.name}</li>
                <li>strength: ${character.strength}</li>
                <li>dexterity: ${character.dexterity}</li>
                <li>constitution: ${character.constitution}</li>
                <li>intelligence: ${character.intelligence}</li>
                <li>winsdom: ${character.winsdom}</li>
                <li>charisma: ${character.charisma}</li>
                <li>Race: ${character.race.name}</li>
                <li>Weapon: ${character.weapon.name}</li>
                <br>
            </#list>
        </ul>
    </body>
</html> 