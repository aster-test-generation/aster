import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_init(self):
        instance = Play()
        self.assertIsInstance(instance, Play)

    def test_compile(self):
        instance = Play()
        result = instance.compile()
        self.assertIsInstance(result, list)

    def test_get_vars(self):
        instance = Play()
        result = instance.get_vars()
        self.assertIsInstance(result, dict)

    def test_get_vars_files(self):
        instance = Play()
        result = instance.get_vars_files()
        self.assertIsInstance(result, list)

    def test_get_handlers(self):
        instance = Play()
        result = instance.get_handlers()
        self.assertIsInstance(result, list)

    def test_get_roles(self):
        instance = Play()
        result = instance.get_roles()
        self.assertIsInstance(result, list)

    def test_get_tasks(self):
        instance = Play()
        result = instance.get_tasks()
        self.assertIsInstance(result, list)

    def test_serialize(self):
        instance = Play()
        result = instance.serialize()
        self.assertIsInstance(result, dict)

    def test_deserialize(self):
        instance = Play()
        data = {}
        result = instance.deserialize(data)
        self.assertIsInstance(result, Play)

    def test_copy(self):
        instance = Play()
        result = instance.copy()
        self.assertIsInstance(result, Play)

if __name__ == '__main__':
    unittest.main()