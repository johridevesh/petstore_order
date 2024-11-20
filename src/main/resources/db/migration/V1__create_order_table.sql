CREATE TABLE orders (
    id INTEGER PRIMARY KEY,
    customer_id INTEGER NOT NULL,
    order_date DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    total_amount DECIMAL(10,2) NOT NULL,
    UNIQUE (id)
);

CREATE INDEX idx_customer_id ON orders(customer_id);

INSERT INTO orders (id, customer_id, order_date, status, total_amount) VALUES (1, 201, '2024-11-20 10:00:00', 'Pending', 150.00);
INSERT INTO orders (id, customer_id, order_date, status, total_amount) VALUES (2, 202, '2024-11-20 11:00:00', 'Completed', 200.00);
INSERT INTO orders (id, customer_id, order_date, status, total_amount) VALUES (3, 203, '2024-11-20 12:00:00', 'Shipped', 250.00);