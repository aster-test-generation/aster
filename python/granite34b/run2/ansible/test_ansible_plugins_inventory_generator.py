import unittest
from ansible.plugins.inventory.generator import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_template_method(self):
        inventory_module = InventoryModule()
        pattern = "{{ operation }}_{{ application }}_{{ environment }}_runner"
        variables = {
            "operation": "build",
            "application": "web",
            "environment": "dev"
        }
        result = inventory_module.templar(pattern, variables)
        self.assertEqual(result, "build_web_dev_runner")

    def test_add_parents_method(self):
        inventory_module = InventoryModule()
        inventory = InventoryModule()
        child = "host1"
        parents = [
            {
                "name": "{{ operation }}_{{ application }}_{{ environment }}",
                "parents": [
                    {
                        "name": "{{ operation }}_{{ application }}",
                        "parents": [
                            {
                                "name": "{{ operation }}"
                            },
                            {
                                "name": "{{ application }}"
                            }
                        ]
                    },
                    {
                        "name": "{{ application }}_{{ environment }}",
                        "parents": [
                            {
                                "name": "{{ application }}"
                            },
                            {
                                "name": "{{ environment }}"
                            }
                        ]
                    }
                ]
            },
            {
                "name": "runner"
            }
        ]
        template_vars = {
            "operation": "build",
            "application": "web",
            "environment": "dev"
        }
        def test_add_parents_with_one_parent(self):
        self.assertIn(child, inventory.groups)
        self.assertIn("build_web_dev", inventory.groups)
        self.assertIn("build_web", inventory.groups)
        self.assertIn("build", inventory.groups)
        self.assertIn("web_dev", inventory.groups)
        self.assertIn("web", inventory.groups)
        self.assertIn("dev", inventory.groups)
        self.assertIn("runner", inventory.groups)

    def test_parse_method(self):
        inventory_module = InventoryModule()
        inventory = InventoryModule()
        path = "path/to/config/file"
        config = {
            "layers": {
                "operation": ["build", "launch"],
                "environment": ["dev", "test", "prod"],
                "application": ["web", "api"]
            },
            "hosts": {
                "name": "{{ operation }}_{{ application }}_{{ environment }}_runner",
                "parents": [
                    {
                        "name": "{{ operation }}_{{ application }}_{{ environment }}",
                        "parents": [
                            {
                                "name": "{{ operation }}_{{ application }}",
                                "parents": [
                                    {
                                        "name": "{{ operation }}"
                                    },
                                    {
                                        "name": "{{ application }}"
                                    }
                                ]
                            },
                            {
                                "name": "{{ application }}_{{ environment }}",
                                "parents": [
                                    {
                                        "name": "{{ application }}"
                                    },
                                    {
                                        "name": "{{ environment }}"
                                    }
                                ]
                            }
                        ]
                    },
                    {
                        "name": "runner"
                    }
                ]
            }
        }
        inventory_module.parse(inventory, None, path)
        self.assertEqual(len(inventory.hosts), 24)
        self.assertEqual(len(inventory.groups), 11)

if __name__ == '__main__':
    unittest.main()