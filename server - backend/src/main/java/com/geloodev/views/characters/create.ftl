<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <h2>Create Character</h2>
    <form method="post" action="/characters/create">
        <label for="name">Name: </label>
        <input type="text" id="name" name="name" required><br>

        <label for="strength">Strength:</label>
        <input type="number" id="strength" name="strength" required><br>

        <label for="dexterity">Dexterity:</label>
        <input type="number" id="dexterity" name="dexterity" required><br>

        <label for="constitution">Constitution:</label>
        <input type="number" id="constitution" name="constitution" required><br>

        <label for="intelligence">Intelligence:</label>
        <input type="number" id="intelligence" name="intelligence" required><br>

        <label for="winsdom">Winsdom:</label>
        <input type="number" id="winsdom" name="winsdom" required><br>

        <label for="charisma">Charisma:</label>
        <input type="number" id="charisma" name="charisma" required><br>

        <label for="race">Race: </label>
        <select id="race" name="race" required>
            <#list races as race>
                <option value="${race.id}">${race.name}</option>
            </#list>
        </select><br>

        <label for="class">Class: </label>
        <select id="characterClass" name="characterClass" required>
            <#list characterClasses as characterClass>
                <option value="${characterClass.id}">${characterClass.name}</option>
            </#list>
        </select><br>

        <label for="weapon">Weapon: </label>
        <select id="weapon" name="weapon" required>
            <#list weapons as weapon>
                <option value="${weapon.id}">${weapon.name}</option>
            </#list>
        </select><br>

        <br>

        <button type="submit">Create</button>
    </form>
</body>
</html>
