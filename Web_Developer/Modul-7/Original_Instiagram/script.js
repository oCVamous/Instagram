let posts = [
    {
        'author': 'Tagesschau',
        'profil': 'img/tagesschau.png',
        'image': 'img/tagesschauImg.png',
        'description': 'Ein neuer Reporter kommt in unser Team',
        'location': 'Tschechien, Prag',
        'comments': []
    },

    {
        'author': 'Steffi',
        'profil': 'img/steffi.jpg',
        'image': 'img/steffiImg.jpg',
        'description': 'Ohh guck mal wie schön',
        'location': 'Portugal, Lissabon',
        'comments': []
    },

    {
        'author': 'Max',
        'profil': 'img/max.jpg',
        'image': 'img/maxImg.jpg',
        'description': 'Sehe ich nicht cool aus?',
        'location': 'USA, New-York',
        'comments': []
    }
];

function show() {
    document.getElementById('left').innerHTML += '';

    for (let i = 0; i < posts.length; i++) {
        const element = posts[i];

        document.getElementById('left').innerHTML += `
        
            <div class="left">
                <div class="from">
                    <div class="from-left">
                        <img src="${element['profil']}" alt="">
                        <p> <b> ${element['author']} </b> </p>
                    </div>

                    <div class="from-right">
                        <img src="img/dots.png" alt="">
                    </div>
                </div>
                <div class="pictures">
                    <img src="${element['image']}" alt="">
                </div>
                <div class="icon-box">
                    <div class="icon-left">
                        <img class="iconUnderPost" src="img/heart (1).png" alt="">
                        <img class="iconUnderPost" src="img/chat.png" alt="">
                        <img class="iconUnderPost" src="img/send.png" alt="">
                    </div>
                    <div class="icon-right">
                        <img class="iconUnderPost" src="img/bookmark.png" alt="">
                    </div>
                </div>
                <div class="likesNumber">
                    <p><b>Gefällt 42 Mal</b></p>
                </div>
                <div class="myComment">
                    <p><b>${element['author']}</b></p>
                    <p>${element['description']}</p>
                </div>
                <div class="otherComment">
                    <div id="theOtherComments${i}">
                        <p class="contentPost" >${element['comments']}</p>
                    </div>
                    <div class="moreCommentsAndTime">
                        <p class"comment">Alle 42 Kommentare ansehen</p>
                        <p class"comment-time">Vor 42 Minuten</p>
                    </div>
                </div>
                <div class="createComment">
                    <div class="smiley">
                    <img src="img/smiley.png" alt="">
                    </div>
                    <div class="textfield">
                        <textarea placeholder="Kommentieren..." name="" class="textfield ${i}" id="textfield ${i}" cols="30" rows="10"></textarea>
                    </div>
                    <div class="postBtn">
                        <p onclick="newPost(${i})">Posten</p>
                    </div>
                </div>
            </div>
               `;
    }
}

function newPost(i) {
    let input = document.getElementById('textfield ' + i).value;

    if (input != "") {
        posts[i]['comments'].push(["<b>p.sterz </b>"+input]);
    }
    document.getElementById('textfield ' + i).value = "";
    renderComments(i);

}

function renderComments(i) {
    let element = posts[i];
    document.getElementById('theOtherComments'+i).innerHTML = "";
    for (let i = 0; i < element['comments'].length; i++) {
        document.getElementById('theOtherComments' + i).innerHTML += `
            <div id="CommentsFromOther">
               
                    <p> ${element['comments']} </p>
                </div>
            </div>
        `;

    }

}
