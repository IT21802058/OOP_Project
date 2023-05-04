const addForm = document.getElementById('add-form');
const removeForm = document.getElementById('remove-form');
const capacity = document.getElementById('capacity');
const cylinders = document.getElementById('cylinders');

// Submit form to add a gas cylinder
addForm.addEventListener('submit', (event) => {
    event.preventDefault();
    const size = event.target.elements.size.value;
    if (!size || size < 1) {
        alert('Please enter a valid size!');
        return;
    }
    fetch('api.php?action=add&size=' + size)
        .then(response => response.json())
        .then(data => {
            alert(data.message);
            updateStatus();
        })
        .catch(error => console.error(error));
});

// Submit form to remove a gas cylinder
removeForm.addEventListener('submit', (event) => {
    event.preventDefault();
    const size = event.target.elements.size.value;
    if (!size || size < 1) {
        alert('Please enter a valid size!');
        return;
    }
    fetch('api.php?action=remove&size=' + size)
        .then(response => response.json())
        .then(data => {
            alert(data.message);
            updateStatus();
        })
       
