### 📄 Basic Structure

```yaml
services:           # Define your containers here
  web-app:          # Service name (internal DNS name)
    image: node:18  # Image to pull from Docker Hub
    ports:
      - "3000:3000" # Host:Container mapping
    networks:
      - frontend
    volumes:
      - .:/app      # Bind mount (Host:Container)

networks:           # Define custom isolated networks
  frontend:

volumes:            # Define persistent storage
  db-data:
```

## 🔑 Common Service Parameters