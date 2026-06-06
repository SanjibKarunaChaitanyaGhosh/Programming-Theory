const btn = document.getElementById("notifyBtn");
const container = document.getElementById("notification-container");

let count = 1;

btn.addEventListener("click", () => {

    const notification = document.createElement("div");

    notification.classList.add("notification");

    notification.innerText = `Notification ${count++}`;

    // Newest notification on top
    container.prepend(notification);

    // Auto remove after 5 seconds
    setTimeout(() => {
        notification.remove();
    }, 5000);

});