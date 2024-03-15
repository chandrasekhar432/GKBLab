/**
 * 
 */let name = document.getElementById('name');
let email = document.getElementById('email');
let age = document.getElementById('age');
let dob = document.getElementById('dob');

let number = /[0-9]/;
let mail = /[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}/;






let btn = document.getElementById('btn');
console.log(btn);



// btn.addEventListener("click",async(e)=>{
//     e.preventDefault();

//     let div1 = document.getElementById('div1');
//     let div2 = document.getElementById('div2');



//     if(mail.test(email.value) === false){
//         div1.innerHTML = "this filed must contain @ symbol";
//         div1.style.color="red";

//     }
//     else{
//         div1.innerHTML='';
//     }
//     if(number.test(age.value) === false){
//         div2.innerHTML="this field contain positive integer only";
//         div2.style.color="red"; 

//     }
//     else{
//     div2.innerHTML='';
//     }
// })






 function validateForm() {
            var name = document.getElementById('name').value.trim();
            var email = document.getElementById('email').value.trim();
            var age = parseInt(document.getElementById('age').value);
            var dob = document.getElementById('dob').value;

            var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            
            if (!emailRegex.test(email)) {
                alert('Invalid email format');
                return false;
            }

            if (isNaN(age) || age < 0) {
                alert('Age must be a positive integer');
                return false;
            }

            return true;
        }
 


