## The Script

### Slide Introduction
Most of the details of our system were already covered in the midterm presentation but as an overview, the system aims to be a more citizen centric human resource management tool. 

There are two main users.

Citizens use the system for their career. They input their occupational data and access resources like job news, certifications, job postings, job trends and predictions, and learning materials.

Then, city managers use the system as a tool for human resource management. It allows city managers to view detailed reports on their workforce. 

This bottom-up, data-driven approach, city managers help respond to evolving career demands and city needs. 

### Slide Architecture
The overall architectural structure of our system is split into three parts, user interface/presentation tier, backend services/application tier, and database/data tier. 

Ya can imagine the structure here is like a three-tiered cake. With one tier of the cake built on top of another tier while serving its own purpose. The tiers are isolated on their own and they each consist their own inner structure.

### Slide How We Did it
We split the implementation to two groups 3 guys on frontend work and 3 guys on backend work. Jesse floats in between to help with members and also some other stuff like hosting, project setup, database work.

We used Vue for front end framework, spring boot and java for backend, and postgresql for database. We also used git and github for source code management and collaboration.

### Slide Front End
We used Vue for the front end and follows a component based architecture. So our user interface is split into small, reusable or components. Think of it like lego blocks where each blocks are a component. Instead of creating each view functionalities from scratch, we assemble views from these pre-built components. We use this approach because its useful since we have many similar views and can divide the work for each for team members to work paralelly at the same time.

The component implementation follows Model-View-View Model architecture. 'Model' represents data and business logic of the application. 'View' is the visual component rendered to the browser as something the user can see or interact or see. 'View model' is intermediary between the View and the Model. It handles the presentation logic and state management. 

### Slide Back End
Our backend uses spring boot. The structure of backend is split to multiple vertical slices based on each core functionalities domain of the system. So here there is one vertical slice the domain of demand, which is an employment target for a given occupation set by city managers. And then analytics domain, which is clickstream and user analytics reporting.

These slices follow a layered architecture. In a slice there consist multiple layers serving their own purpose for each domain functionalities. So a presentation layer for mapping HTTP requests to Java method invocations, business layer for the business logics, and data access layer for interacting with data tier.

### And next is the explanation how we implemented some of the each features of the system.