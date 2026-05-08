# ==============================
# DEVELOPMENT
# ==============================

dev:
	docker compose \
	-f docker-compose.yml \
	-f docker-compose.dev.yml \
	up --build

dev-down:
	docker compose \
	-f docker-compose.yml \
	-f docker-compose.dev.yml \
	down

# ==============================
# PRODUCTION
# ==============================

prod:
	docker compose \
	-f docker-compose.yml \
	-f docker-compose.prod.yml \
	up --build -d

prod-down:
	docker compose \
	-f docker-compose.yml \
	-f docker-compose.prod.yml \
	down

# ==============================
# LOGS
# ==============================

logs:
	docker logs -f backend-dev

# ==============================
# SHELL
# ==============================

shell:
	docker exec -it backend-dev sh

# ==============================
# CLEANUP
# ==============================

clean:
	docker system prune -af