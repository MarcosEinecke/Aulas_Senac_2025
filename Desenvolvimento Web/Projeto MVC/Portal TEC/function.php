<?php

function view($view, $data = [])
{

    foreach ($data as $key => $value) {
        $$key = $value;
    }


    
    require "view/template/app.php";
}


function view2($view2, $data = [])
{

    foreach ($data as $key => $value) {
        $$key = $value;
    }


    
    require "view/template/appContato.php";
}

