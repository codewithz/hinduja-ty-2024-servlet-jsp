CREATE TABLE movies (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        actor VARCHAR(100),
                        actress VARCHAR(100),
                        director VARCHAR(100),
                        release_date DATE,
                        rate_point NUMERIC(2, 1)
);

INSERT INTO movies (name, actor, actress, director, release_date, rate_point) VALUES
                                                                                  ('The Great Escape', 'Steve McQueen', 'Anne Bancroft', 'John Sturges', '1963-07-04', 8.2),
                                                                                  ('Inception', 'Leonardo DiCaprio', 'Marion Cotillard', 'Christopher Nolan', '2010-07-16', 8.8),
                                                                                  ('The Dark Knight', 'Christian Bale', 'Maggie Gyllenhaal', 'Christopher Nolan', '2008-07-18', 9.0),
                                                                                  ('Pulp Fiction', 'John Travolta', 'Uma Thurman', 'Quentin Tarantino', '1994-10-14', 8.9),
                                                                                  ('The Shawshank Redemption', 'Tim Robbins', 'Renee Blaine', 'Frank Darabont', '1994-09-22', 9.3),
                                                                                  ('Forrest Gump', 'Tom Hanks', 'Robin Wright', 'Robert Zemeckis', '1994-07-06', 8.8),
                                                                                  ('The Matrix', 'Keanu Reeves', 'Carrie-Anne Moss', 'The Wachowskis', '1999-03-31', 8.7),
                                                                                  ('Avengers: Endgame', 'Robert Downey Jr.', 'Scarlett Johansson', 'Anthony and Joe Russo', '2019-04-26', 8.4),
                                                                                  ('Titanic', 'Leonardo DiCaprio', 'Kate Winslet', 'James Cameron', '1997-12-19', 7.9),
                                                                                  ('The Godfather', 'Marlon Brando', 'Diane Keaton', 'Francis Ford Coppola', '1972-03-24', 9.2);



