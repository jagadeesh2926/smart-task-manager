# 🎯 Smart Task Manager

A full-stack task management application built with **Java Spring Boot** and **React**. Features include priority management, status tracking, search functionality, and a modern UI.

![Task Manager Demo](https://via.placeholder.com/800x400?text=Task+Manager+Screenshot)

## ✨ Features

- ✅ Create, Read, Update, Delete (CRUD) tasks
- 🎨 Priority levels: Low, Medium, High, Urgent
- 📊 Status tracking: To Do, In Progress, Completed, Cancelled
- 🔍 Search and filter tasks
- 📁 Organize by categories
- ⏰ Due date tracking
- 🎯 Clean and intuitive UI
- 📱 Responsive design

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Maven
- Lombok

### Frontend
- React 18
- Axios
- CSS3
- Modern JavaScript (ES6+)

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Node.js 18+ & npm

### Backend Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/task-manager.git
   cd task-manager/backend
   ```

2. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

3. **API will be available at:** `http://localhost:8080`

4. **Access H2 Console:** `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:taskdb`
   - Username: `sa`
   - Password: (leave empty)

### API Endpoints

```
GET    /api/tasks              - Get all tasks
GET    /api/tasks/{id}         - Get task by ID
POST   /api/tasks              - Create new task
PUT    /api/tasks/{id}         - Update task
DELETE /api/tasks/{id}         - Delete task
GET    /api/tasks/search       - Search tasks
GET    /api/tasks/status/{status}     - Filter by status
GET    /api/tasks/priority/{priority} - Filter by priority
```

### Sample Request

```json
POST /api/tasks
{
  "title": "Complete Project Documentation",
  "description": "Write comprehensive README and API docs",
  "priority": "HIGH",
  "status": "IN_PROGRESS",
  "category": "Documentation",
  "dueDate": "2024-03-15T10:00:00"
}
```

## 📸 Screenshots

### Task List
![Task List](https://via.placeholder.com/600x400?text=Task+List+View)

### Create Task
![Create Task](https://via.placeholder.com/600x400?text=Create+Task+Form)

## 🎯 Project Structure

```
task-manager/
├── backend/
│   └── src/main/java/com/taskmanager/
│       ├── controller/
│       ├── model/
│       ├── repository/
│       ├── service/
│       └── TaskManagerApplication.java
├── frontend/
│   └── src/
│       ├── components/
│       ├── services/
│       └── App.js
└── README.md
```

## 🧪 Testing

Run backend tests:
```bash
mvn test
```

## 🚢 Deployment

### Deploy Backend (Railway/Render)
1. Create account on Railway.app
2. Connect GitHub repository
3. Deploy backend service
4. Update database to PostgreSQL

### Deploy Frontend (Vercel/Netlify)
1. Build production version
2. Deploy to Vercel or Netlify
3. Update API endpoint URL

## 📈 Future Enhancements

- [ ] User authentication & authorization
- [ ] Task sharing & collaboration
- [ ] Email notifications
- [ ] File attachments
- [ ] Dark mode
- [ ] Mobile app

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is licensed under the MIT License.

## 👤 Author

**Jagadeesh Bandaru**
- LinkedIn: [Jagadeesh Bandaru](https://linkedin.com/in/jagadeesh-bandaru-050b85292)
- GitHub: [@jagadeesh2926](https://github.com/jagadeesh2926)
- Email: jagadeeshbandaru05@gmail.com

## 🙏 Acknowledgments

- Spring Boot Documentation
- React Documentation
- Inspiration from modern task management tools

---

⭐ Star this repo if you find it helpful!