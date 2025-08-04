FROM node:20

WORKDIR /app

# Only copy package files first (for caching)
COPY package*.json ./
# BUILD_PROFILE is set in the .env file
ENV NODE_ENV=$BUILD_PROFILE

# Clean install for correct platform
RUN npm install

# Then copy the rest of the source
COPY . .

CMD ["npm", "run", "dev"]
