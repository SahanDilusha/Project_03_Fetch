function getReuest() {
    fetch("X?name=Sahan")
            .then(
                    response => {
                        console.log("Done");
                        
                    }
            ).then(
            text => {
                console.log(text);
            }
    ).catch(
            error => {
                console.log(error);
            }
    );
}

function postRequest() {
    
    fetch("");
    
}