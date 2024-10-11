import unittest
from ansible.modules.replace import *
from tempfile import TemporaryDirectory
import os
import re
import json


class TestReplaceModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                path=dict(required=True),
                regexp=dict(required=True),
                replace=dict(required=True),
                after=dict(required=False, default=None),
                validate=dict(required=False, default=None),
                unsafe_writes=dict(required=False, default=False)
            )
        )
        self.module.tmpdir = TemporaryDirectory()

    def test_write_changes(self):
        contents = b"old.host.name"
        path = os.path.join(self.module.tmpdir.name, "hosts")
        write_changes(self.module, contents, path)
        with open(path, "rb") as f:
            self.assertEqual(f.read(), b"old.host.name")

    def test_write_changes_after(self):
        contents = b"NameVirtualHost [*]\nold.host.name"
        path = os.path.join(self.module.tmpdir.name, "default.conf")
        write_changes(self.module, contents, path)
        with open(path, "rb") as f:
            self.assertEqual(f.read(), b"NameVirtualHost [*]\nnew.host.name")

    def test_write_changes_validate(self):
        contents = b"old.host.name"
        path = os.path.join(self.module.tmpdir.name, "hosts")
        self.module.params['validate'] = 'cat %s | grep old.host.name'
        write_changes(self.module, contents, path)
        with open(path, "rb") as f:
            self.assertEqual(f.read(), b"old.host.name")

    def test_write_changes_validate_failure(self):
        contents = b"old.host.name"
        path = os.path.join(self.module.tmpdir.name, "hosts")
        self.module.params['validate'] = 'cat %s | grep new.host.name'
        with self.assertRaises(SystemExit):
            write_changes(self.module, contents, path)

    def test_write_changes_unsafe_writes(self):
        contents = b"old.host.name"
        path = os.path.join(self.module.tmpdir.name, "hosts")
        self.module.params['unsafe_writes'] = True
        write_changes(self.module, contents, path)
        with open(path, "rb") as f:
            self.assertEqual(f.read(), b"new.host.name")

    def test_write_changes_safe_writes(self):
        contents = b"old.host.name"
        path = os.path.join(self.module.tmpdir.name, "hosts")
        self.module.params['unsafe_writes'] = False
        with self.assertRaises(SystemExit):
            write_changes(self.module, contents, path)

if __name__ == '__main__':
    unittest.main()