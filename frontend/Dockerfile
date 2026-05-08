# ==========================================
# BASE STAGE
# ==========================================
FROM node:22-alpine AS base

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

# ==========================================
# DEVELOPMENT STAGE
# ==========================================
FROM base AS development

EXPOSE 3000

CMD ["npm", "run", "dev"]

# ==========================================
# BUILD STAGE
# ==========================================
FROM base AS build

RUN npm run build

# ==========================================
# PRODUCTION STAGE
# ==========================================
FROM node:22-alpine AS production

WORKDIR /app

ENV NODE_ENV=production

COPY --from=build /app ./

EXPOSE 3000

CMD ["npm", "start"]
