let html  = document.documentElement;

let btn = document.getElementById('toggleBtn');

let stored = localStorage.getItem('theme');

let imgPomba = document.getElementById('imgPomba');

let preferDark = window.matchMedia && window.matchMedia('(prefers-color-shceme: dark)').matches;

function applyTheme(theme){

    if(theme === 'dark'){
        html.classList.add('dark');
        imgPomba.src = 'img/55.png';
    }else{

        html.classList.remove('dark');
        imgPomba.src = 'img/pomba branca.png';

    }
}

if(stored === 'dark' || stored === 'light'){
    applyTheme(stored);
}else{

    applyTheme(preferDark ? 'dark' : 'light');

}

btn.addEventListener('click', () => {
    let isNowDark = html.classList.toggle('dark');
    const theme = isNowDark ? 'dark' : 'light';
    localStorage.setItem('theme', theme);
    applyTheme(theme);
})