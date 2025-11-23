# Novus Shopping Hub

**Novus** is an advanced, modern e-commerce platform built with Java and Spring Boot. It provides a seamless marketplace experience for both customers and sellers, featuring secure authentication, real-time product management, shopping cart functionality, and integrated payment processing.

---

## 🚀 Features

### 🛍️ For Customers
- **User Authentication**: Secure signup and login with Email OTP verification.
- **Product Discovery**: Browse and search for products across various categories.
- **Shopping Cart**: Add items, manage quantities, and view total costs in real-time.
- **Secure Checkout**: Integrated **Razorpay** payment gateway for safe transactions.
- **Order History**: Track past orders and payment status.
- **Responsive Design**: Optimized for desktop and mobile devices.

### 🏪 For Sellers
- **Seller Dashboard**: Dedicated portal to manage business operations.
- **Product Management**: Add, edit, and delete products with image uploads.
- **Inventory Control**: Real-time stock management.
- **Sales Tracking**: View customer orders and earnings.

### 🔐 Security & Tech
- **Session Management**: Secure session handling for user states.
- **Data Encryption**: AES encryption for sensitive user data.
- **Role-Based Access**: Strict separation between Customer and Seller routes.

---

## 🛠️ Technology Stack

- **Backend**: Java 17, Spring Boot 3.4.2
- **Database**: MySQL 8.0
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap
- **Payment Gateway**: Razorpay
- **Email Service**: JavaMailSender (SMTP)
- **Containerization**: Docker, Docker Compose
- **Build Tool**: Maven

---

## 📋 Prerequisites

Before running the application, ensure you have the following installed:

- **Java 17** or higher
- **Maven** (for local build)
- **Docker** & **Docker Compose** (recommended for easy setup)
- **MySQL** (if running locally without Docker)

---

## ⚡ Getting Started

### Option 1: Run with Docker (Recommended)

1.  **Clone the repository**
    ```bash
    git clone https://github.com/yourusername/novus.git
    cd novus
    ```

2.  **Start the application**
    This command will start both the MySQL database and the Spring Boot application.
    ```bash
    docker-compose up --build
    ```

3.  **Access the application**
    Open your browser and navigate to: [http://localhost:8080](http://localhost:8080)

### Option 2: Run Locally with Maven

1.  **Configure Database**
    Ensure you have a MySQL server running on `localhost:3306`. Create a database named `ecommerce`.
    Update `src/main/resources/application.properties` if your credentials differ from `root/root`.

2.  **Build the project**
    ```bash
    mvn clean install
    ```

3.  **Run the application**
    ```bash
    mvn spring-boot:run
    ```

---

## ⚙️ Configuration

The application is configured via `src/main/resources/application.properties`.

### Key Properties

| Property | Description | Default |
| :--- | :--- | :--- |
| `server.port` | Application Port | `8080` |
| `spring.datasource.url` | Database URL | `jdbc:mysql://db:3306/ecommerce` |
| `spring.mail.username` | SMTP Email | *(Set your email)* |
| `spring.mail.password` | SMTP Password | *(Set your app password)* |
| `razorpay.key` | Razorpay Key ID | *(Set your key)* |
| `razorpay.secret` | Razorpay Secret | *(Set your secret)* |

> [!IMPORTANT]
> For security, never commit real API keys or passwords to version control. Use environment variables or a secure vault in production.

---

## 📂 Project Structure

```
novus/
├── src/
│   ├── main/
│   │   ├── java/com/supertiles/ecommerce/
│   │   │   ├── controller/       # Web Controllers
│   │   │   ├── dto/              # Data Transfer Objects / Entities
│   │   │   ├── repository/       # JPA Repositories
│   │   │   ├── service/          # Business Logic & Auth
│   │   │   └── EcommerceApplication.java
│   │   └── resources/
│   │       ├── templates/        # Thymeleaf HTML Templates
│   │       └── application.properties
│   └── test/                     # Unit Tests
├── Dockerfile                    # App Container Config
├── docker-compose.yml            # Orchestration Config
├── pom.xml                       # Maven Dependencies
└── README.md                     # Project Documentation
```

---

## 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a Pull Request.

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.
