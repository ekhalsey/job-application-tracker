# coding-events-demo
1. PURPOSE OF THE APP:
  create and organize events with accompanying details

2. STATE OF THE APP:
  events can be created, viewed, filtered, deleted, categorized, and can be associated with tags


3. TO BE ADDED:

Person Class

fields:

+ String primary key/id
+ String username
+ String firstName
+ String lastName
+ String email
+ String password

    @ManyToMany
+ List<Event> eventsAttending

    @OneToMany
+ List<Event> eventsCreated

methods:
- constructor
- getters and setters

-could add additional class for user preferences/settings/details?
