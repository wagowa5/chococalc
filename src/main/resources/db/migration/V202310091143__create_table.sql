CREATE TABLE users (
    id CHAR(36) NOT NULL COMMENT 'ユーザーID',
    name VARCHAR(255) NOT NULL COMMENT 'ユーザー名',
    password VARCHAR(255) NOT NULL COMMENT 'パスワード(サーバー発行)',
    created_at DATETIME NOT NULL COMMENT '作成日時',
    updated_at DATETIME NOT NULL COMMENT '更新日時',
    PRIMARY KEY (id)
);

CREATE TABLE tokens (
    id CHAR(36) NOT NULL COMMENT 'トークンID',
    user_id CHAR(36) NOT NULL COMMENT 'ユーザーID',
    access_token CHAR(36) NOT NULL COMMENT 'アクセストークン',
    refresh_token CHAR(36) NOT NULL COMMENT 'リフレッシュトークン',
    access_expired_at DATETIME NOT NULL COMMENT 'アクセストークン有効期限',
    refresh_expired_at DATETIME NOT NULL COMMENT 'リフレッシュトークン有効期限',
    created_at DATETIME NOT NULL COMMENT '作成日時',
    updated_at DATETIME NOT NULL COMMENT '更新日時',
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE character_info (
    id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    user_id CHAR(36) NOT NULL COMMENT 'ユーザーID',
    job_id CHAR(36) NOT NULL COMMENT '職業ID',
    level INT NOT NULL COMMENT 'レベル',
    c_pow INT NOT NULL COMMENT 'ステ振りPOW',
    c_int INT NOT NULL COMMENT 'ステ振りINT',
    c_spd INT NOT NULL COMMENT 'ステ振りSPD',
    c_vit INT NOT NULL COMMENT 'ステ振りVIT',
    c_luk INT NOT NULL COMMENT 'ステ振りLUK',
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE input_status (
    id CHAR(36) NOT NULL COMMENT '入力ステータスID',
    charcter_id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    input_level INT NOT NULL DEFAULT 99 COMMENT 'レベル',
    input_pow VARCHAR(255) COMMENT '入力POW',
    input_int VARCHAR(255) COMMENT '入力INT',
    input_spd VARCHAR(255) COMMENT '入力SPD',
    input_vit VARCHAR(255) COMMENT '入力VIT',
    input_luk VARCHAR(255) COMMENT '入力LUK',
    input_atk VARCHAR(255) COMMENT '入力ATK',
    input_def VARCHAR(255) COMMENT '入力DEF',
    input_mat VARCHAR(255) COMMENT '入力MAT',
    input_mdf VARCHAR(255) COMMENT '入力MDF',
    PRIMARY KEY (id),
    FOREIGN KEY (charcter_id) REFERENCES character_info (id) ON DELETE CASCADE
);

CREATE TABLE jobs (
    id CHAR(36) NOT NULL COMMENT '職業ID',
    name VARCHAR(255) NOT NULL COMMENT '職業名',
    PRIMARY KEY (id)
);

CREATE TABLE charcter_vita (
    id CHAR(36) NOT NULL COMMENT 'ビタID',
    charcter_id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    all_vita_pow INT NOT NULL DEFAULT 0 COMMENT 'ALLビタのPOW上昇値',
    all_vita_int INT NOT NULL DEFAULT 0 COMMENT 'ALLビタのINT上昇値',
    all_vita_spd INT NOT NULL DEFAULT 0 COMMENT 'ALLビタのSPD上昇値',
    all_vita_vit INT NOT NULL DEFAULT 0 COMMENT 'ALLビタのVIT上昇値',
    all_vita_luk INT NOT NULL DEFAULT 0 COMMENT 'ALLビタのLUK上昇値',
    pow_vita INT NOT NULL DEFAULT 0 COMMENT 'POWビタ上昇値',
    int_vita INT NOT NULL DEFAULT 0 COMMENT 'INTビタ上昇値',
    spd_vita INT NOT NULL DEFAULT 0 COMMENT 'SPDビタ上昇値',
    vit_vita INT NOT NULL DEFAULT 0 COMMENT 'VITビタ上昇値',
    luk_vita INT NOT NULL DEFAULT 0 COMMENT 'LUKビタ上昇値',
    PRIMARY KEY (id),
    FOREIGN KEY (charcter_id) REFERENCES character_info (id) ON DELETE CASCADE
);

CREATE TABLE charcter_can (
    id CHAR(36) NOT NULL COMMENT '魔獣缶ステータスID',
    charcter_id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    can_pow INT NOT NULL DEFAULT 0 COMMENT '魔獣缶・シールのPOW上減値',
    can_int INT NOT NULL DEFAULT 0 COMMENT '魔獣缶・シールのINT上減値',
    can_spd INT NOT NULL DEFAULT 0 COMMENT '魔獣缶・シールのSPD上減値',
    can_vit INT NOT NULL DEFAULT 0 COMMENT '魔獣缶・シールのVIT上減値',
    can_luk INT NOT NULL DEFAULT 0 COMMENT '魔獣缶・シールのLUK上減値',
    PRIMARY KEY (id),
    FOREIGN KEY (charcter_id) REFERENCES character_info (id) ON DELETE CASCADE
);

CREATE TABLE charcter_scroll (
    id CHAR(36) NOT NULL COMMENT '巻物ステータスID',
    charcter_id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    scroll_hp INT NOT NULL DEFAULT 0 COMMENT '巻物のHP上昇値',
    scroll_sp INT NOT NULL DEFAULT 0 COMMENT '巻物のSP上昇値',
    scroll_pow INT NOT NULL DEFAULT 0 COMMENT '巻物のPOW上昇値',
    scroll_int INT NOT NULL DEFAULT 0 COMMENT '巻物のINT上昇値',
    scroll_spd INT NOT NULL DEFAULT 0 COMMENT '巻物のSPD上昇値',
    scroll_vit INT NOT NULL DEFAULT 0 COMMENT '巻物のVIT上昇値',
    scroll_luk INT NOT NULL DEFAULT 0 COMMENT '巻物のLUK上昇値',
    scroll_atk INT NOT NULL DEFAULT 0 COMMENT '巻物のATK上昇値',
    scroll_def INT NOT NULL DEFAULT 0 COMMENT '巻物のDEF上昇値',
    scroll_mat INT NOT NULL DEFAULT 0 COMMENT '巻物のMAT上昇値',
    scroll_mdf INT NOT NULL DEFAULT 0 COMMENT '巻物のMDF上昇値',
    scroll_mov INT NOT NULL DEFAULT 0 COMMENT '巻物のMOV上昇値',
    PRIMARY KEY (id),
    FOREIGN KEY (charcter_id) REFERENCES character_info (id) ON DELETE CASCADE
);

CREATE TABLE charcter_skill (
    id CHAR(36) NOT NULL COMMENT 'スキルステータスID',
    charcter_id CHAR(36) NOT NULL COMMENT 'キャラクターID',
    blood_scraper INT NOT NULL DEFAULT 0 COMMENT 'ブラッドスクレイパーのPOW上昇値',
    special_hp INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのHP上昇値',
    special_sp INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのSP上昇値',
    special_pow INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのPOW上昇値',
    special_int INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのINT上昇値',
    special_spd INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのSPD上昇値',
    special_vit INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのVIT上昇値',
    special_luk INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのLUK上昇値',
    special_atk INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのATK上昇値',
    special_def INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのDEF上昇値',
    special_mat INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのMAT上昇値',
    special_mdf INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのMDF上昇値',
    special_mov INT NOT NULL DEFAULT 0 COMMENT '特殊スキルのMOV上昇値',
    PRIMARY KEY (id)
);

CREATE TABLE mannequins (
    id CHAR(36) NOT NULL COMMENT 'マネキンID',
    user_id CHAR(36) NOT NULL COMMENT 'ユーザーID',
    mannequin_name VARCHAR(16) NOT NULL COMMENT 'マネキン名',
    input_pow VARCHAR(255) COMMENT '入力POW',
    input_int VARCHAR(255) COMMENT '入力INT',
    input_spd VARCHAR(255) COMMENT '入力SPD',
    input_vit VARCHAR(255) COMMENT '入力VIT',
    input_luk VARCHAR(255) COMMENT '入力LUK',
    input_atk VARCHAR(255) COMMENT '入力ATK',
    input_def VARCHAR(255) COMMENT '入力DEF',
    input_mat VARCHAR(255) COMMENT '入力MAT',
    input_mdf VARCHAR(255) COMMENT '入力MDF',
    created_at DATETIME NOT NULL COMMENT '作成日時',
    updated_at DATETIME NOT NULL COMMENT '更新日時',
    PRIMARY KEY (id),
    UNIQUE KEY (user_id, mannequin_name),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
