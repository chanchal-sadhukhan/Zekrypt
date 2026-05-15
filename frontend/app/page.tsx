"use client";

import { useEffect, useState } from "react";

type FileRecord = {
  id: number;
  fileName: string;
};

export default function Home() {
  const [files, setFiles] = useState<FileRecord[]>([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/files")
      .then((res) => res.json())
      .then((data) => setFiles(data))
      .catch(console.error);
  }, []);

  return (
    <main className="p-10">
      <h1 className="text-3xl font-bold mb-6">
        Zekrypt Files
      </h1>

      <div className="space-y-4">
        {files.map((file) => (
          <div
            key={file.id}
            className="border p-4 rounded"
          >
            {file.fileName}
          </div>
        ))}
      </div>
    </main>
  );
}
