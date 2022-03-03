let names = ['Berta Humboldt', 'John Doe'];
let phoneNumbers = ['017612345678', '017687654321'];

let namesAsText = "['Berta Humboldt', 'John Doe']";

function render() {
    let content = document.getElementById('content');
    content.innerHTML = '';
    content.innerHTML += '<h1>Kontaktbuch</h1>';
    content.innerHTML += `
        <div>
            <input placeholder="name" id="name">
            <input placeholder="Telefon" id="phone">
            <button onclick="addContact()">Hinzufügen</button>
        </div>
    `;

    for (let i = 0; i < names.length; i++) {
        const name = names[i];
        const phoneNumber = phoneNumbers[i];

        content.innerHTML += `
            <div class="card">
                <b>Name: </b> ${name} <br>
                <b>Telefon: </b> ${phoneNumber} <br>
                <button onclick="deleteContact(${i})">Löschen</button>
            </div>
        `;
    }
}


function addContact() {
    console.log('Läuft!');
    let name = document.getElementById('name').value;
    let phone = document.getElementById('phone').value;
    names.push(name);
    phoneNumbers.push(phone);

    render();
    save();
}

function deleteContact(i) {
    names.splice(i, 1);
    phoneNumbers.splice(i, 1);
    render();
    save();
}

function save() {
    let namesAsText = JSON.stringify(names);
    localStorage.setItem('names', namesAsText);
}