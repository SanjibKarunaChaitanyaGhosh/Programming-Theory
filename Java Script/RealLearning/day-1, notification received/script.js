// Notification Store (like Android's internal storage)

const notifications = [];

// Render function 

const list = document.getElementById("list");

function render() {

    list.innerHTML = "";

    notifications.forEach((notification, index) => {

        const div = document.createElement("div");

        div.className = "notification";

        div.innerHTML = `
            <strong>${notification.title}</strong>
            <br>
            ${notification.message}
        `;

        div.addEventListener("click", () => {
            removeNotification(index);
        });

        list.prepend(div);
    });
}

// Add Notification

function addNotification(title, message) {

    notifications.push({
        id: Date.now(),
        title,
        message
    });

    render();
}

// Remove Notification

function removeNotification(index) {

    notifications.splice(index, 1);

    render();
}

// Button Event

let count = 1;

document.getElementById("addBtn")
.addEventListener("click", () => {

    addNotification(
        `App ${count}`,
        `Message ${count}`
    );

    count++;
});