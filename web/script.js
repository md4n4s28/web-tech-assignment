const form = document.getElementById('userForm');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const message = document.getElementById('message');

function setMessage(text, type) {
  message.textContent = text;
  message.className = type;
}

form.addEventListener('submit', (event) => {
  event.preventDefault();

  const name = nameInput.value.trim();
  const email = emailInput.value.trim();
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (name.length < 2) {
    setMessage('Name must be at least 2 characters long.', 'error');
    return;
  }

  if (!emailPattern.test(email)) {
    setMessage('Please enter a valid email address.', 'error');
    return;
  }

  setMessage(`Thanks, ${name}. Form submitted successfully.`, 'success');
  form.reset();
});
