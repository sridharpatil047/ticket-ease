# API Documentation

## Seat Selection & Locking

### Fetch all products

| GET  | /endpoint/:id |
|------|---------------|

*description goes here*
- Roles :
- Permissions :

---
<details> 
    <summary>Request</summary>

#### Headers
| Header        | Value            |
|---------------|------------------|
| Authorization | Bearer \<JWT>    |
| Content-Type  | application/json |


#### Path Parameters
| Parameter | Description | Type | Default Value | Required | Possible Values |
|-----------|-------------|------|---------------|----------|-----------------|
| id        | -           | long | -             | YES      | -               |


#### Query Parameters
| Parameter | Description | Type | Default Value | Required | Possible Values |
|-----------|-------------|------|---------------|----------|-----------------|
| id        | -           | long | -             | YES      | -               |


#### Body
| Key | Description | Type | Default Value | Required | Possible Values |
|-----|-------------|------|---------------|----------|-----------------|
| id  | -           | long | -             | YES      | -               |

</details>

---

<details>
    <summary>Response</summary>

#### Status Code
| Code | Description  |
|------|--------------|
| 201  | Role created |
| 400  | Bad request  |

#### Headers
| Header        | Value            |
|---------------|------------------|
| Authorization | Bearer \<JWT>    |
| Content-Type  | application/json |

#### Body
| Key | Description | Type | Default Value | Required | Possible Values |
|-----|-------------|------|---------------|----------|-----------------|
| id  | -           | long | -             | YES      | -               |

</details>