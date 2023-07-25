document.addEventListener('DOMContentLoaded', function() {
    const todoList = document.getElementById('todoList');
    const inputTodo = document.getElementById('inputTodo');
    const btnAdd = document.getElementById('btnAdd');
    let todoArr = [];

    btnAdd.addEventListener('click', function(e) {
        let todoValue = inputTodo.value;
        if(todoValue == ""){
            alert('할 일을 입력하세요.');
            return;
        }

        const newTodoItem = {
            id : Date.now(),
            text : todoValue,
        };

        todoArr.push(newTodoItem);
        localStorage.setItem("listItem", JSON.stringify(todoArr));



        const listItem = document.createElement('li');
        listItem.className = 'd-flex list-group-item';
        listItem.innerText = newTodoItem;

        const listBtn = document.createElement('button');
        listBtn.className = 'btn-close ms-auto';
        listBtn.onclick = function(e){
            let pNode = e.target.parentNode;
            todoList.removeChild(pNode);
        }
        listItem.appendChild(listBtn);
        todoList.appendChild(listItem);

        inputTodo.value = '' ;
    });
});



