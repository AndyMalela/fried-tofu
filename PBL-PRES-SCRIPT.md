## The Script

### Slide First
Hello everyone we are from group agile or group e. We are presenting our project which is System for Citizen-Centric Human Resource Management in Smart Cities.

### Slide Agenda
Here is the agenda for this presentation.

### Slide Introduction
Most of the details of our system were already covered in the midterm presentation but as an overview, the system aims to provide a citizen centric approach to human resource management. 

There are two main users.

Citizens use the system for their career. They input their occupational data and access resources like job news, certifications, learning materials, job opportunities, job trends and predictions, and learning materials.

Then, city managers use the system as a tool for human resource management. It allows city managers to view detailed reports on their workforce, prioritizing citizen data. 

This bottom-up, data-driven approach, city managers aims to help respond to evolving career demands and city needs. 

### Slide Architecture
The overall architectural structure of our system is split into three parts, user interface/presentation tier, backend services/application tier, and database/data tier. 

Ya can imagine the structure here is like a three-tiered cake. With one layer of the cake serving its own purpose, and that is built on top of another layer. With each layers consisting their own inner components.

### Slide How We Did it
We split the implementation to two groups 3 guys on frontend work and 3 guys on backend work. Jesse floats in between to help with members and also some other stuff (what stuff?).

We used Vue for front end framework, spring boot and java for backend, and postgresql for database. We also used git and github for source code management and collaboration.

### Slide Front End
We used Vue for the front end and used a component based architecture. So our user interface is into smaller, reusable or components. Think of it like lego blocks. Instead of creating each view functionalities from scratch, we assemble views from these pre-built components. We use this approach because its useful since we have many similar views and its a common pattern for using Vue framework.

The component implementation follows Model-View-View Model architecture. 'Model' represents data and business logic of the application. 'View' is the visual component rendered to the browser as something the user can see or interact or see. 'View model' is intermediary between the View and the Model. It handles the presentation logic and state management. 

### Slide Back End
Our backend uses spring boot. The structure is split to multiple vertical slices based on each core functionalities domain of the system. So here there is one vertical slice for x domain, and another for y. 

These slices follow a layered architecture. In a slice theres a presentation layer for mapping HTTP requests to Java method invocations, business layer for the business logic, and data access layer for interacting with data.

### And next is the explanation how we implemented some of the each functionalities of the system.