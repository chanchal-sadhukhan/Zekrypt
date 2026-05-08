# Zekrypt

Zero Knowledge Encrypted Multi-Cloud Storage Platform

---

## Overview

**Zekrypt** is a full-stack, privacy-focused cloud storage platform built around the concept of **Zero Knowledge Encryption**.

The platform allows users to securely upload, manage, and access encrypted files across multiple cloud providers while ensuring that **only the user can decrypt their data**.

Neither:
- Zekrypt
- Cloud providers
- Third parties

can access the original file contents.

---

## Vision

Modern cloud storage providers offer scalability and convenience, but users often sacrifice:
- privacy
- encryption ownership
- key control
- data portability

Zekrypt aims to solve this by acting as a secure encryption and cloud orchestration layer on top of providers like:
- Google Drive
- iCloud
- Microsoft OneDrive
- AWS S3
- Dropbox
- Backblaze
- MinIO
- Self-hosted storage systems

The core principle is:

> "Your files. Your keys. Your control."

---

# Core Concepts

## Zero Knowledge Encryption

Files are encrypted on the client side before upload.

The server:
- never stores plaintext files
- never knows encryption keys
- cannot decrypt user data

---

## Multi-Cloud Abstraction

Users can connect multiple providers and manage them from one dashboard.

Example:
- Google Drive for documents
- OneDrive for work files
- S3 for backups

---

## Master Key Management

Users own a master encryption key used for:
- file encryption
- key derivation
- secure file sharing

Planned features:
- recovery phrases
- hardware security integration
- password-derived encryption
- key rotation
- encrypted key vaults

---

## Secure File Sharing

Users will be able to:
- generate secure encrypted share links
- share files without exposing master keys
- set expiration and permissions

---

# Planned Architecture

## Backend

Built using:
- Spring Boot
- Spring Security
- OAuth2
- JWT Authentication
- Redis
- PostgreSQL

---

## Frontend

Built using:
- Next.js
- TypeScript
- TailwindCSS

---

## Infrastructure

Containerized using:
- Docker
- Docker Compose

Future plans:
- Kubernetes
- GitHub Actions CI/CD
- Terraform
- Helm
- Observability stack

---

# Current Project Status

Project is currently under active development.

Initial focus:
- production-grade architecture
- scalable backend foundation
- secure encryption workflow
- developer-friendly local setup

---

# Repository Structure

```txt
zekrypt/
│
├── backend/
│
├── frontend/
│
├── infra/
│
├── docker-compose.yml
├── docker-compose.dev.yml
├── docker-compose.prod.yml
│
├── .env.dev
├── .env.prod
│
├── Makefile
│
└── README.md
```

---

# Local Development Setup

## Prerequisites

Install:

- Docker
- Docker Compose
- Make

Recommended:
- Java 21
- Node.js 22+

---

# Clone Repository

```bash
git clone <your-repository-url>

cd zekrypt
```

---

# Development Environment

Start development containers:

```bash
make dev
```

Stop development containers:

```bash
make dev-down
```

---

# Production Environment

Start production containers:

```bash
make prod
```

Stop production containers:

```bash
make prod-down
```

---

# Useful Commands

## View Logs

```bash
make logs
```

---

## Enter Backend Container

```bash
make shell
```

---

## Cleanup Docker Resources

```bash
make clean
```

---

# Backend Development

Current backend endpoint:

```http
GET /api/health
```

Example:

```bash
curl http://localhost:8080/api/health
```

Expected response:

```txt
Backend is running
```

---

# Security Goals

Zekrypt is being designed with security-first principles:

- Zero knowledge architecture
- End-to-end encryption
- Non-root production containers
- Secure OAuth flows
- Encrypted secrets management
- Rate limiting
- Secure file streaming
- Short-lived access tokens
- Refresh token rotation
- Encrypted metadata storage

---

# Planned Features Roadmap

## Authentication & Identity

- [ ] User registration and login
- [ ] JWT authentication
- [ ] Refresh token rotation
- [ ] Google OAuth login
- [ ] Microsoft OAuth login
- [ ] Apple Sign In
- [ ] Multi-device session management
- [ ] Role-based access control
- [ ] Account recovery flow
- [ ] MFA / 2FA support

---

## Encryption System

- [ ] Client-side file encryption
- [ ] AES-256 encryption pipeline
- [ ] Master key generation
- [ ] Password-derived encryption keys
- [ ] Secure key vault
- [ ] Recovery phrase support
- [ ] Key rotation support
- [ ] Encrypted metadata storage
- [ ] Streaming encryption for large files
- [ ] Chunked encrypted uploads

---

## Cloud Provider Integrations

- [ ] Google Drive integration
- [ ] Microsoft OneDrive integration
- [ ] iCloud integration
- [ ] AWS S3 integration
- [ ] Dropbox integration
- [ ] Backblaze integration
- [ ] MinIO integration
- [ ] Multi-provider sync engine
- [ ] Automatic failover uploads
- [ ] Provider quota monitoring

---

## File Management

- [ ] Secure file uploads
- [ ] Secure file downloads
- [ ] File versioning
- [ ] Folder management
- [ ] Drag-and-drop uploads
- [ ] Secure file previews
- [ ] Search and filtering
- [ ] Trash and recovery system
- [ ] Bulk uploads
- [ ] Large file support

---

## Secure Sharing

- [ ] Encrypted share links
- [ ] Password-protected sharing
- [ ] Share expiration
- [ ] One-time download links
- [ ] Permission-based sharing
- [ ] Secure collaboration workspace

---

## Infrastructure & DevOps

- [x] Dockerized backend setup
- [x] Multi-stage Docker builds
- [x] Development hot reload
- [x] Production container setup
- [x] Makefile-based workflow
- [ ] Frontend Docker setup
- [ ] PostgreSQL integration
- [ ] Redis integration
- [ ] Nginx reverse proxy
- [ ] GitHub Actions CI/CD
- [ ] Kubernetes manifests
- [ ] Helm deployment
- [ ] Terraform infrastructure
- [ ] Monitoring and observability
- [ ] Centralized logging

---

## Observability & Monitoring

- [ ] Grafana dashboards
- [ ] Loki log aggregation
- [ ] Prometheus metrics
- [ ] OpenTelemetry tracing
- [ ] Health monitoring
- [ ] Audit logging

---

# Long-Term Goals

- Self-hosted deployment support
- Enterprise team workspaces
- Secure collaboration
- End-to-end encrypted backups
- Cross-platform desktop apps
- Mobile applications
- Offline sync engine
- Distributed encrypted storage layer

---

# Contributing

Contributions, ideas, architecture suggestions, and security reviews are welcome.

As the project evolves, contribution guidelines and development standards will be added.

---

# License

This project is currently under development.

![License](https://img.shields.io/badge/license-AGPL--3.0-blue.svg)